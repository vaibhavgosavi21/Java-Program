class PhonesDriver 
{
	public static void main(String[] args) 
	{
		Phones p1 = new Phones();
		p1.brand = "Motorola";
		p1.model = "Edge 50 Pro";
		p1.rom = 256;
		p1.ram = 8;
		p1.camera = 3;
		p1.price = 31600.0;

		System.out.println(p1);
		System.out.println("Brand: "+p1.brand);
		System.out.println("Model: "+p1.model);
		System.out.println("ROM: "+p1.rom+"GB");
		System.out.println("RAM: "+p1.ram+"GB");
		System.out.println("Camera: "+p1.camera);
		System.out.println("Price: "+p1.price);
		System.out.println("-----------------------------------");

		Phones p2 = new Phones();
		p2.brand = "VIVO";
		p2.model = "Vivo V40";
		p2.rom = 128;
		p2.ram = 8;
		p2.camera = 2;
		p2.price = 32000.0;

		System.out.println(p2);
		System.out.println("Brand: "+p2.brand);
		System.out.println("Model: "+p2.model);
		System.out.println("ROM: "+p2.rom+"GB");
		System.out.println("RAM: "+p2.ram+"GB");
		System.out.println("Camera: "+p2.camera);
		System.out.println("Price: "+p2.price);
		System.out.println("-----------------------------------");

		Phones p3 = new Phones();
		p3.brand = "OPPO";
		p3.model = "Reno 10";
		p3.rom = 512;
		p3.ram = 12;
		p3.camera = 4;
		p3.price = 20000.0;

		System.out.println(p3);
		System.out.println("Brand: "+p3.brand);
		System.out.println("Model: "+p3.model);
		System.out.println("ROM: "+p3.rom+"GB");
		System.out.println("RAM: "+p3.ram+"GB");
		System.out.println("Camera: "+p3.camera);
		System.out.println("Price: "+p3.price);
		System.out.println("-----------------------------------");
	}
}
