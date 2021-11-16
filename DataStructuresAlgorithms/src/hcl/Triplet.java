package hcl;

import java.util.*;

class Triplet {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		return b;
    // Write your code here

    }

}

//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        List<Integer> result = Triplet.compareTriplets(a, b);
//
//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining(" "))
//            + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}