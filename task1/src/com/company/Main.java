package com.company;

public class Main {

    public static void main(String[] args) {

        /*в консоль выведет числа от 100 до 50, пропустив числа от 73х до 67ми, а когда будет число 55, то выведи слово «здрасте»*/

        for (int i = 100; i >= 50; i--) {

            if (i == 55) {
                System.out.println("здрасте");
            }

            else if(i>67 && i<87)
            continue;

            else {
                System.out.println(i);
                }
            }
        }
    }

