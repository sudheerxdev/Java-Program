package corejava.sixoct;

public class Target {

    public static void main(String[] args) {

        int x[][] = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};

        int y[][] = {{1,2,3,4},{2,3,4,5},{3,4,5,6}};

        int z[][] = new int[3][4];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {

                z[i][j] = x[i][j]+y[i][j];

                System.out.print(z[i][j] + " ");

            }
            System.out.println();
        }

    }
}