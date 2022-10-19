class Speaker{
String name;
static boolean isConnected;
public Speaker(String name){
this.name=name;
}
public static boolean onOroff(){
System.out.println("Inside onOroff()");
if (isConnected==false){
isConnected=true;
System.out.println("The Speaker turned on");
}
else if(isConnected==true)
{
isConnected=false;
System.out.println("Speaker is turned  off");

}



return isConnected;
}}