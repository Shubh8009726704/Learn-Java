public class StringMethod {
    public static void main(String args[]){
        //string concate

        String firstName = "Shubham  ";
        String lastName = "Sharma";
        System.out.println(firstName.concat(lastName));

        //index of
        String txt = "My name is Shubham ";
        System.out.println(txt.indexOf("Shubham"));

        //length
        String name = "Manish Mishra";
        System.out.println(name.length());

        //join
        String friends = String.join(" ", "Manish","Amit","Vivek","Rajkumar");
        System.out.println(friends);

        //replace
        String myStr = "Finger";
        System.out.println(myStr.replace('F', 'S'));

        //substring
        String city = "I am from Varanasi";
        System.out.println(city.substring(10,18));

        //split
        String course = "I am ADIT Student";
        String regex = "[,\\.\\s]";
        String[] myArray = course.split(regex);
        for (String s : myArray) {
          System.out.println(s);
        }


      String text = "Nsti Ramanthapur";
      System.out.println(text.toUpperCase());
      System.out.println(text.toLowerCase());
}
}