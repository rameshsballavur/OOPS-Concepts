interface Post{

	public default void like(){
		System.out.println("like");
	}
	public default void comment(){
		System.out.println("comment");
	}
	public default void share(){
		System.out.println("share");
	}
}

interface PhotoEdit{
	public void resize();
	public void crop();
	public void filter();
}

interface VideoEdit{
	public void trim();
	public void addAudio();
	public void changeSpeed();

}

class Photo implements Post,PhotoEdit{
	double size;
	int reso = 200;
	@Override
	public void resize(){
		System.out.println("resize done");
	}
	@Override
	public void crop(){
		System.out.println("crop done");
	}
	@Override
	public void filter(){
		System.out.println("filter applied");
	}

	public void collage(){
		System.out.println("collage photo");
	}
}

class Video implements Post,VideoEdit{
	double size;
	int duration = 5;
	@Override
	public void trim(){
		System.out.println("trimmed");
	}

	@Override
	public void addAudio(){
		System.out.println("audio added");
	}
	@Override
	public void changeSpeed(){
		System.out.println("1x speed");
	}

	public void quality(){
		System.out.println("select quality of video");
	}

	public void minute(){
		System.out.println("minutes of video");
	}
}

class Main6{
	public static void main(String[] args) {
		Photo p = new Photo();
		System.out.println(p.size);
		System.out.println(p.reso);
		p.collage();
		p.resize();
		p.crop();
		p.filter();
		p.like();
		p.comment();
		p.share();

		System.out.println("-----------------------------------");

		Video v = new Video();
		System.out.println(v.size);
		System.out.println(v.duration);
		v.quality();
		v.minute();
		v.trim();
		v.addAudio();
		v.changeSpeed();
		v.like();
		v.comment();
		v.share();
	}
}