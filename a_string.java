public class a_string {
    public static void main(String[] args) {
        // menggunakan string
        String salam = "Hello world!"; //ini variable string
        System.out.println(salam);

        // menggunaan char
        char[] firstchar = {'a', 'g', 'h', 'a'};// ini variable char
        String firsthing = new String(firstchar);
        System.out.println(firsthing);

        // mengetahui lengthh atau panjang string menggunakan length
        String lent = "halo agha";
        int panjang = lent.length(); //gunakan length untuk mengukur panjang string
        System.out.println(panjang);

        // menampilkan karakter dari sebuah string
        String agha = "hello agha";
        char hasil = agha.charAt(0); // gunakan char at untuk ambil dari dari index 0 sampe seterusnya
        System.out.println(hasil);
    }
}
