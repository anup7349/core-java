class VehicleeRunner{
public static void main(String[] args) {
		Vehicle v = new Vehicle("Honda", "Red");
		System.out.println("Model: " + v.getModel());
		System.out.println("Shade: " + v.getShade());
		System.out.println("==================");
		v.setModel("Suzuki");
		System.out.println("Model: " + v.getModel());
		v.setShade("Blue");
		System.out.println("Shade: " + v.getShade());
	}
}
