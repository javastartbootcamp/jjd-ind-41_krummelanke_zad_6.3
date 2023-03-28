package logic;

public class Table {

    public void createTable() {
        int[][] table;
        Input input = new Input();
        int rowsNumber = input.declareRows();
        int columnsNumber = input.declareColumns();

        table = new int[rowsNumber][columnsNumber];

        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table[y].length; x++) {
                table[y][x] = y * x;
            }
        }
        printTable(table);
    }

    private void printTable(int[][] table) {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table[y].length; x++) {
                System.out.printf("%4d %s", table[y][x], "|");
            }
            System.out.println("");
            for (int i = 0; i < table[y].length; i++) {
                System.out.printf("%s", "______");
            }
            System.out.println("");
        }
    }
}
