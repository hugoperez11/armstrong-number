package dev.hugo;

public class ArmstrongNumber {

    public static boolean isArmstrong(int number) {
        // Convertir el número a cadena para contar los dígitos
        String numStr = String.valueOf(number);
        int n = numStr.length(); // Número de dígitos
        
        int sum = 0;
        int originalNumber = number;
        
        // Calcular la suma de los dígitos elevados a la potencia de n
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, n);
            number /= 10;
        }
        
        // Comprobar si la suma es igual al número original
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        int number = 371; // Ejemplo de número de Armstrong
        
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

