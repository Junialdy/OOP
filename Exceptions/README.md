## Java Exception

Saat mengeksekusi kode Java, berbagai kesalahan dapat terjadi, seperti kesalahan pengkodean yang dilakukan oleh programmer, kesalahan karena input yang salah, atau hal-hal lain yang tidak terduga. Ketika terjadi kesalahan, Java biasanya akan berhenti dan menghasilkan pesan kesalahan. Istilah teknisnya adalah: Java akan melemparkan **pengecualian/exception** (throw an error).

example:

```
try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}
```

#### Pernyataan **finally** memungkinkan kita mengeksekusi blok kode setelah try...catch apa pun hasilnya:

example:

```
public class Main {
  public static void main(String[] args) {
    try {
      int[] myNumbers = {1, 2, 3};
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Something went wrong.");
    } finally {
      System.out.println("The 'try catch' is finished.");
    }
  }
}
```
Output:

```
Something went wrong.
The 'try catch' is finished.
```
