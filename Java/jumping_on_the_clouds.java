class Result {
    public static int jumpingOnClouds(List<Integer> clouds) {
        int numberOfJumps = 0;
        int i = 0;

        while (i < clouds.size() - 1) {
            if(i + 2 == clouds.size() || clouds.get(i + 2) == 1) {
                i++;
                numberOfJumps++;
            } else {
                i += 2;
                numberOfJumps++;
            }
        }

        return numberOfJumps;
    }
}