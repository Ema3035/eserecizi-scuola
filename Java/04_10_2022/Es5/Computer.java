
public class Computer {
    public int ram, hdd, wattUps;
    public String cpu, gpu, custodia;
    public double prezzo, freqCpu, freqGpu, freqRam;
public Computer(int ram, int hdd, int wattUps, String cpu, String gpu, String custodia, double prezzo, double freqCpu, double freqGpu, double freqRam) {
    this.ram = ram;
    this.hdd = hdd;
    this.wattUps = wattUps;
    this.cpu = cpu;
    this.gpu = gpu;
    this.custodia = custodia;
    this.prezzo = prezzo;
    this.freqCpu = freqCpu;
    this.freqGpu = freqGpu;
    this.freqRam = freqRam;
}

public void showData(){
    System.out.println("RAM: " + ram + "GB");
    System.out.println("HDD: " + hdd + "GB");
    System.out.println("Watt PSU: " + wattUps + "W");
    System.out.println("CPU: " + cpu);
    System.out.println("GPU: " + gpu);
    System.out.println("Chassis: " + custodia);
    System.out.println("Price: " + prezzo + "$");
    System.out.println("CPU Frequency: " + freqCpu + "GHz");
    System.out.println("GPU Frequency: " + freqGpu + "GHz");
    System.out.println("RAM Frequency: " + freqRam + "GHz");
}

public void addRam(int addRam){
    ram += addRam;
}
}