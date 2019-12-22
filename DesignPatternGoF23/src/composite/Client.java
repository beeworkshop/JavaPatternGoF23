package composite;

public class Client {
	public static void main(String[] args) {
		AbstractFile f2, f3, f4, f5;
		Folder f1 = new Folder("我的收藏");

		f2 = new ImageFile("苍老师写真.jpg");
		f3 = new TextFile("明教日记.txt");
		f1.add(f2);
		f1.add(f3);

		Folder f11 = new Folder("电影");
		f4 = new VideoFile("僵尸世界大战.avi");
		f5 = new VideoFile("变脸.avi");
		f11.add(f4);
		f11.add(f5);
		f1.add(f11);

//		f2.killVirus();

		f1.killVirus();

		// killVirus()——统一的处理形式

	}
}
