public class practice {
    public static void main(String[] args) throws Exception {
  
        char [][] mdArray = {{'S','L','A','M'}, 
                            {'T','I','L', 'E'}, 
                            {'E','A','T', 'S'}, 
                            {'P', 'R', 'O', 'S'}};
    
  
        // WORD 1
        System.out.println("1. WORD 1");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 0) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        // WORD 2
        System.out.println("2. WORD 2");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 1) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        // WORD 3
        System.out.println("3. WORD 3");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 2) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        // WORD 4

        System.out.println("4. WORD 4");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 3) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        // WORD 5
        System.out.println("");
        System.out.println("");
        System.out.println("5. WORD 5");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 0) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        // WORD 6
        System.out.println("");
        System.out.println("");
        System.out.println("6. WORD 6");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 1) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        // WORD 7
        System.out.println("");
        System.out.println("");
        System.out.println("7. WORD 7");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 2) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        // WORD 8
        System.out.println("");
        System.out.println("");
        System.out.println("8. WORD 8");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (column == 3) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        // WORD 9
        // System.out.println("");
        // System.out.println("");
        // System.out.println("9. WORD 9");

        // for (int row = 0; row < 4; row++) {
        //     System.out.println("");
        //     for (int column = 0; column < 4; column++) {
        //         if (row == 1 && (column == 1 || column == 2)) {
        //             System.out.print(mdArray[row][column]);
        //         }
        //         else if (row == 2 && (column == 1 || column == 2)) {
        //             System.out.print(mdArray[row][column]);
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        // }

        // // WORD 10
        // System.out.println("");
        // System.out.println("");
        // System.out.println("10. WORD 10");

        // for (int row = 0; row < 4; row++) {
        //     System.out.println("");
        //     for (int column = 0; column < 4; column++) {
        //         if (row == 1 && (column == 1 || column == 2)) {
        //             System.out.print(mdArray[row][column]);
        //         }
        //         else if (row == 2 && (column == 1 || column == 2)) {
        //             System.out.print(mdArray[row][column]);
        //         }
        //         else if (row == 0 && (column == 0 || column == 3)) {
        //             System.out.print(mdArray[row][column]);
        //         }
        //         else if (row == 3 && (column == 0 || column == 3)) {
        //             System.out.print(mdArray[row][column]);
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        // }

        // WORD 9
        System.out.println("");
        System.out.println("");
        System.out.println("9. WORD 9");

        for (int row = 3; row >= 0; row--) {
            System.out.println("");
            for (int column = 0; column >= 0; column--) {
                if (column == 0) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }
        
        // WORD 10
        System.out.println("");
        System.out.println("");
        System.out.println("10. WORD 10");

        for (int row = 3; row >= 0; row--) {
            System.out.println("");
            for (int column = 1; column >= 1; column--) {
                if (column == 1) {
                    System.out.print(mdArray[row][column]);
                }
            }
        }

        // WORD 11
        System.out.println("");
        System.out.println("");
        System.out.println("11. WORD 11");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 0 && column == 0) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 1 && column == 1) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 2 && column == 2) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 3 && column == 3) {
                    System.out.print(mdArray[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }

        // WORD 12
        System.out.println("");
        System.out.println("");
        System.out.println("12. WORD 12");

        for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 3 && column == 0) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 2 && column == 1) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 1 && column == 2) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 0 && column == 3) {
                    System.out.print(mdArray[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }

            // WORD 13
            System.out.println("");
            System.out.println("");
            System.out.println("13. WORD 13");

            for (int row = 0; row < 4; row++) {
                System.out.println("");
                for (int column = 0; column < 4; column++) {
                    if (row == 0 && column == 0) {
                        System.out.print(mdArray[row][column]);
                    }
                    else if (row == 1 && column == 1) {
                        System.out.print(mdArray[row][column]);
                    }
                    else if (row == 2 && column == 2) {
                        System.out.print(mdArray[row][column]);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }

            // WORD 14
            System.out.println("");
            System.out.println("");
            System.out.println("14. WORD 14");
    
            for (int row = 3; row >= 1; row--) {
                System.out.println("");
                for (int column = 0; column >= 0; column--) {
                    if (column == 0) {
                        System.out.print(mdArray[row][column]);
                    }
                }
            }

            // WORD 15
            System.out.println("");
            System.out.println("");
            System.out.println("15. WORD 15");

            for (int row = 0; row < 4; row++) {
            System.out.println("");
            for (int column = 0; column < 4; column++) {
                if (row == 3 && column == 0) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 2 && column == 1) {
                    System.out.print(mdArray[row][column]);
                }
                else if (row == 1 && column == 2) {
                    System.out.print(mdArray[row][column]);
                }
                else{
                    System.out.print(" ");
                }
            }
        }

        // WORD 16
        System.out.println("");
        System.out.println("");
        System.out.println("16. WORD 16");

        for (int row = 3; row >= 0; row--) {
        System.out.println("");
        for (int column = 3; column >= 0; column--) {
            if (row == 3 && column == 0) {
                System.out.print(mdArray[row][column]);
            }
            else if (row == 2 && column == 1) {
                System.out.print(mdArray[row][column]);
            }
            else if (row == 1 && column == 2) {
                System.out.print(mdArray[row][column]);
            }
            else{
                System.out.print(" ");
            }
        }
    }

    // WORD 17 
        // System.out.println("");
        System.out.println("");
        System.out.println("17. WORD 17");

        for (int row = 3; row >= 0; row--) {
        System.out.println("");
        for (int column = 3; column >= 0; column--) {
            if (column == 3) {

            }
            else if (row == 1) {
                System.out.print(mdArray[row][column]);
            }
        }
    }

    // WORD 18
    System.out.println("");
    System.out.println("");
    System.out.println("18. WORD 18");

    for (int row = 2; row >= 0; row--) {
        System.out.println("");
        for (int column = 1; column >= 1; column--) {
            if (column == 1) {
                System.out.print(mdArray[row][column]);
            }
        }
    }

    // WORD 19
    System.out.println("");
    System.out.println("");
    System.out.println("19. WORD 19");

    for (int row = 0; row < 4; row++) {
        System.out.println("");
        for (int column = 0; column < 3; column++) {
            if (row == 2) {
                System.out.print(mdArray[row][column]);
            }
        }
    }

// WORD 20
    System.out.println("");
    System.out.println("");
    System.out.println("20. WORD 20");

    for (int row = 3; row >= 0; row--) {
        System.out.println("");
        for (int column = 3; column >= 0; column--) {
            if (row == 3 && column == 2) {
                System.out.print(mdArray[row][column]);
            }
            else if (row == 2 && column == 1) {
                System.out.print(mdArray[row][column]);
            }
            else if (row == 1 && column == 0) {
                System.out.print(mdArray[row][column]);
            }
            else{
                System.out.print(" ");
            }
        }
    }


    }
  }
