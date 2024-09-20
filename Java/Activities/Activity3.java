package Activities;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double seconds = 1000000000;

        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;
        
        double AgeonEarth= seconds / EarthSeconds ;
        double AgeonMercury= seconds / EarthSeconds / MercurySeconds;
        double AgeonVenus= seconds / EarthSeconds / VenusSeconds;
        double AgeonMars= seconds / EarthSeconds / MarsSeconds;
        double AgeonJupiter= seconds / EarthSeconds / JupiterSeconds;
        double AgeonSaturn= seconds / EarthSeconds / SaturnSeconds;
        double AgeonUranus= seconds / EarthSeconds / UranusSeconds;
        double AgeonNeptune= seconds / EarthSeconds / NeptuneSeconds;
        
        System.out.println("Age on Earth: " + AgeonEarth);
        System.out.println("Age on Mercury: " + AgeonMercury);
        System.out.println("Age on Venus: " + AgeonVenus);
        System.out.println("Age on Mars: " + AgeonMars);
        System.out.println("Age on Jupiter: " + AgeonJupiter);
        System.out.println("Age on Saturn: " + AgeonSaturn);
        System.out.println("Age on Uranus: " + AgeonUranus);
        System.out.println("Age on Neptune: " + AgeonNeptune);
	}

}
