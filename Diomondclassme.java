package COM.SUDHEER.ARRAYLIST;

interface GenericInterf <T >{
       void GandMarao(T value);
}
class ganddo{
    public static void main(String[] args) {
        GenericInterf<String> st = new GenericInterf<String>() {
            @Override
            public void GandMarao(String value) {
                System.out.println("le bata girir" + value);
            }
        };
        st.GandMarao("gand marao");

    }
}
