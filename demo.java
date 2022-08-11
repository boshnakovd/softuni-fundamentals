import java.util.*;

import static java.lang.Integer.parseInt;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] archery = Arrays.stream(scan.nextLine().split("\\|")).mapToInt(Integer::parseInt).toArray();
        String command = scan.nextLine();
        int points = 0;
        while (!command.equals("Game over")) {
            String[] arr = command.split("@");
            switch (arr[0]) {
                case "Shoot Left":
                    int index = Integer.parseInt(arr[1]);
                    int length = Integer.parseInt(arr[2]);
                    if (!isValidIndex(archery.length, index)) {
                        break;
                    }
                    if (index + length > archery.length) {
                        points = getPoints(archery, 0, points);
                    } else{
                        points = getPoints(archery, index + length + 1, points);
                    }
                    break;
                case "Shoot Right":
                    index = Integer.parseInt(arr[1]);
                    length = Integer.parseInt(arr[2]);
                    if (!isValidIndex(archery.length, index)) {
                        break;
                    }
                    if (index - length < 0) {

                        points = getPoints(archery, archery.length - 1, points);
                    } else {
                        points = getPoints(archery, index - length - 1, points);
                    }
                    break;
                case "Reverse":
                    int[] reverseArchery = new int[archery.length];
                    for (int i = 0; i < archery.length; i++) {
                        reverseArchery[i] = archery[archery.length - 1 - i];
                    }
                    archery = reverseArchery;
                    break;
            }
            command = scan.nextLine();
        }
        StringBuffer sb= new StringBuffer();
        for (int i = 0; i < archery.length; i++) {
            sb.append(archery[i]);
            if (i != archery.length - 1) {
                sb.append(" - ");
            }
        }
        System.out.println(sb.toString());
        System.out.printf("John finished the archery tournament with %d points!", points);
    }

    private static int getPoints(int[] archery, int index, int points) {
        if (archery[index] - 5 == 0){
            points += archery[index];
            archery[index] = 0;
        }
        archery[index] -= 5;
        points += 5;
        return points;
    }

    private static boolean isValidIndex(int length, int index) {
        return index >= 0 && index <= length;
    }
}
