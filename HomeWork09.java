public class HomeWork09{
	public static void main(String[] args) {
		Music song = new Music("となりのトトロ",300);
		song.play();
		System.out.println(song.getInfo());
	}
}
class Music{
	String name;
	int times;

	public Music(String name,int times){
		this.name=name;
		this.times=times;
	}

	public void play(){
		System.out.println("音乐"+name+"正在播放中，时长为"+times+"秒");

	}

	public String getInfo(){
		return "音乐"+name+"时长为"+times+"秒";

	}



}