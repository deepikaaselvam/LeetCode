class Solution {
    
        public int minDominoRotations(int[] tops, int[] bottoms) {
        int rotations = check(tops[0], tops, bottoms);
        if (rotations != -1 || tops[0] == bottoms[0]) {
            return rotations;
        } else {
            return check(bottoms[0], tops, bottoms);
        }
    }

    private int check(int target, int[] tops, int[] bottoms) {
        int rotationsTop = 0;
        int rotationsBottom = 0;
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != target && bottoms[i] != target) {
                return -1;
            } else if (tops[i] != target) {
                rotationsTop++;
            } else if (bottoms[i] != target) {
                rotationsBottom++;
            }
        }
        return Math.min(rotationsTop, rotationsBottom);
    }
}