package dev.hugo;

public class ArmstrongNumber {
    private int number;

    
    public ArmstrongNumber(int number) {
        this.number = number;
    }

   
    public int getNumber() {
        return number;
    }

    
    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isArmstrong() {
        // Convertir el número a cadena para contar los dígitos
        String numStr = String.valueOf(this.number);
        int n = numStr.length(); // Número de dígitos
        
        int sum = 0;
        int originalNumber = this.number;
        
        // Calcular la suma de los dígitos elevados a la potencia de n
        while (originalNumber > 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, n);
            originalNumber /= 10;
        }
        
        // Comprobar si la suma es igual al número original
        return sum == this.number;
    }

    public static void main(String[] args) {
        int number = 371; // Ejemplo de número de Armstrong
        
        ArmstrongNumber armstrongNumber = new ArmstrongNumber(number);
        if (armstrongNumber.isArmstrong()) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
