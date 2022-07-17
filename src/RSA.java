
import java.util.ArrayList;
import java.math.BigInteger;
import javax.swing.JOptionPane;

public class RSA {

    BigInteger P;
    BigInteger Q;
    BigInteger E;

    BigInteger calculatefact1;
    BigInteger calculatefact2;

    BigInteger calculatefact4;

    static ArrayList<Character> none = new ArrayList<>();
    static ArrayList<Character> alphabet = new ArrayList();

    StringBuilder noneAlphabet;
    StringBuilder cipher = new StringBuilder();

    int plain;

    BigInteger plainText;
    BigInteger cipherText;

    public RSA(String p, String q, String e) {
        P = new BigInteger(p);
        Q = new BigInteger(q);
    }

    public RSA() {
    }

    public void getalphabet() {
        String englishAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int i = 0;
        while (i < englishAlphabet.length()) {
            alphabet.add(englishAlphabet.charAt(i));
            i++;
        }
        System.out.println(alphabet.size());
    }

   

    public void factorial() {
     boolean checker = true;
        if (!checker) {
            calculatefact2 = P.multiply(Q);
            calculatefact1 = P.divide(BigInteger.ONE).multiply(Q.subtract(BigInteger.ONE));
        } else if (P.gcd(Q).intValue() == 1 && P.isProbablePrime(2) && Q.isProbablePrime(2)) {
            calculatefact1 = P.multiply(Q);
            calculatefact2 = P.subtract(BigInteger.ONE).multiply(Q.subtract(BigInteger.ONE));
            E = new BigInteger("4");
            while (E.gcd(calculatefact2).intValue() != 1) {
                E = E.add(new BigInteger("1"));
            }
            calculatefact4 = E.modInverse(calculatefact2);

        } else if (E.equals(calculatefact4)) {
            calculatefact4 = calculatefact4.add(calculatefact2);
            calculatefact4 = calculatefact4.mod(calculatefact1);
            System.out.println(calculatefact4);
        }
        System.out.println(calculatefact1 + "   " + calculatefact2 + "   " + E + "   " + calculatefact4);
    }

    public void Encryption(String m1) {

       

        int k = 0;
         boolean checkerProperty = true;
        while (k < m1.length()) {
            if (!checkerProperty) {
                cipher.append(cipherText).append(" ");
                cipherText = plainText.modPow(E, calculatefact1);
                JOptionPane.showMessageDialog(null, "It is for testing.");

            } else if (!alphabet.contains(m1.charAt(k))) {
                none.add(m1.charAt(k));
            } else if (alphabet.contains(m1.charAt(k))) {
                plain = alphabet.indexOf(m1.charAt(k));
                System.out.println(plain);
                plainText = new BigInteger(String.valueOf(plain));
                cipherText = plainText.modPow(E, calculatefact1);
                cipher.append(cipherText).append(" ");
            } else {
                JOptionPane.showMessageDialog(null, "It can't return anything. Please try again.");
            }
            k++;

        }

    }

    public void Decryption(String m2) {

        String adjuster;
        adjuster = (" ");

        String[] cutter;
        boolean testCondition = true;
        cutter = m2.split(" ");
        if (!testCondition) {
            cipher.append(alphabet.get(cipherText.intValue()));
            cipherText = plainText.modPow(calculatefact4, calculatefact1);
            plainText = new BigInteger(adjuster);
        } else {
            for (String cutSetter : cutter) {
                plainText = new BigInteger(cutSetter);
                cipherText = plainText.modPow(calculatefact4, calculatefact1);
                cipher.append(alphabet.get(cipherText.intValue()));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("3, 2, 1...");
    }
}
