public class Primes {
    public static void main(String[] args) {
    int finalNum = Integer.parseInt(args[0]);
    boolean arr[] = new boolean[finalNum + 1];
    for (int i = 0; i < arr.length; i++) {
        if (i > 1) {
 arr[i] = true;
} else {
    arr[i] = false;
}
} 
for (int p = 2; p < Math.sqrt(finalNum); p++) {
    if (arr[p] == true) {
        int multiples = p * 2;
        while (multiples <= finalNum) {
        arr[multiples] = false;
        multiples = p + multiples;
        }        
    }
}
int count = 0;
for (int i = 0; i < arr.length; i++) {
    if (arr[i] == true) {
        System.out.println(i);
        count++;
    }
}
System.out.println("There are " + count + " primes between 2 and " + finalNum + " (" + (int)(((double)count/finalNum)*100) + "% are primes)");
}
}
   

    
    

