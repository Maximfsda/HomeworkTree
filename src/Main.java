public class Main {
    public static void main(String[] args) {
        //Task1
        int years = 2;
        if (years >= 2 && years <= 6 && years != 1) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад.");
        } else {
            if (years >= 7 && years <= 18) {
                System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу.");
            } else {
                if (years > 18 && years < 24) {
                    System.out.println("Если возраст человека равен " + years + ", то его место в университете.");
                } else {
                    if (years >= 24) {
                        System.out.println("Если возраст человека равен " + years + ", то ему пора ходить на работу.");
                    }

                }
            }
        }
        System.out.println();
        //Task2
        int Years = 13;
        if (Years < 5) {
            System.out.println("Ребенку нельзя кататься ,так как ему лет " + Years + " года.");
        } else {
            if (Years >= 5 && Years < 14) {
                System.out.println("Ребенку можно кататься только в сопровождении взрослого,так как ему " + Years + " лет.");
            } else {
                if (Years >= 14) {
                    System.out.println("Ребенку можно кататься без сопровождении взрослого,так как ему " + Years + " лет.");
                }

            }
        }
        System.out.println();
        //Task3
        int one = 5;
        int two = 3;
        int free = 3;
        int max = 0;
        if (one > two) {
            max = one;
            System.out.println("Наибольшее число: " + one);
        } else {
            max = two;
            if (two > free) {
                System.out.println("Наибольшее число: " + two);
            } else {
                max = free;
                System.out.println("Наибольшее число: " + free);
            }
        }

    }
}



