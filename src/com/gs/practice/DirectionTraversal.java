package com.gs.practice;

public class DirectionTraversal {
    public static int[] finalCoordinates(String directions) {
        int x = 0, y = 0;

        String[] dirArray = directions.split(" ");
        for(int i=0;i<dirArray.length;i++) {
            String dir = dirArray[i];

            if (dir.contains("x")) {
                String[] parts = dir.split("x");
                int count = Integer.parseInt(parts[0]);
                String direction = parts[1];

                for (int j = 0; j < count; j++) {
                    if (direction.equals("UP")) {
                        y++;
                    } else if (direction.equals("DOWN")) {
                        y--;
                    } else if (direction.equals("LEFT")) {
                        x--;
                    } else if (direction.equals("RIGHT")) {
                        x++;
                    }
                }
            } else {
                if (dir.equals("U")) {
                    y++;

                } else if (dir.equals("D")) {
                    y--;

                } else if (dir.equals("L")) {
                    x--;
                } else if (dir.equals("R")) {
                    x++;
                }
            }

        }
        return new int[]{x,y};
}
public static void main(String[] args){
    String directions1 = "UUU";
    int[] result1 = finalCoordinates(directions1);
    System.out.println("Final coordinates after 'UUU': (" + result1[0] + ", " + result1[1] + ")");

    // Example 2: URRDDL
    String directions2 = "URRDDL";
    int[] result2 = finalCoordinates(directions2);
    System.out.println("Final coordinates after 'URRDDL': (" + result2[0] + ", " + result2[1] + ")");

    // Additional Testcase: DOWN UP 2xRIGHT DOWN 3xLEFT
    String directions3 = "DOWN UP 2xRIGHT DOWN 3xLEFT";
    int[] result3 = finalCoordinates(directions3);
    System.out.println("Final coordinates after 'DOWN UP 2xRIGHT DOWN 3xLEFT': (" + result3[0] + ", " + result3[1] + ")");
    }
}

