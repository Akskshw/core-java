class SpeakerTester{
public static void main(String a[]){
Speaker speaker=new Speaker("jbl");
boolean isConnected=speaker.onOroff();
System.out.println(isConnected);
speaker.onOroff();
}

}