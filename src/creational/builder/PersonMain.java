package creational.builder;

public class PersonMain {
    public static void main(String[] args) {
        var person = new Person
                .Builder("Milad" ,"Amery" , "00")
                .email("miladamery@yahoo.com")
                .city("Tehran")
                .build();
        /**
         * Some logic. DB call, LOOP, if
         */
        //personBuilder.avenue("");

        //var p1 = new Person("Milad" ,"Amery" , "00");
        /**
         * Need Some logic.
         * p1.setPhonenumber
         */
        /*p1.setEmail("miladamery@yahoo.com");
        p1.setCity("Tehran");

        //How we can guarantee that person won't change?
        p1.setFirstName("HAHAHAHAH");*/
    }
}
