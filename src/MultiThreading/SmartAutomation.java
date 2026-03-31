package MultiThreading;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SmartAutomation {
    static class DeviceTask implements Runnable {
        final String deviceName;
        final int intervalMillis;
        final int priority;
        final int cycles;
        public DeviceTask(String deviceName, int intervalSeconds, int priority, int cycles)
        {
            this.deviceName = deviceName;
            this.intervalMillis = intervalSeconds * 1000;
            this.priority = priority;
            this.cycles = cycles;
        }
        @Override
        public void run() {
            Thread.currentThread().setPriority(priority);
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
            for (int i = 1; i <= cycles; i++)
            {
                String timestamp = sdf.format(new Date());
                System.out.println(deviceName + " cycle " + i + " at " + timestamp);
                try {
                    Thread.sleep(intervalMillis);
                } catch (InterruptedException e) {
                    System.out.println(deviceName + " interrupted.");
                    Thread.currentThread().interrupt();
                    break;
                }
            }
            System.out.println(deviceName + " completed all cycles.");
        }
    }

    public static void main(String[] args)
    {
        Thread securityCamera = new Thread(new DeviceTask("Security Camera", 3, Thread.MAX_PRIORITY, 5));
        Thread temperatureSensor = new Thread(new DeviceTask("Temperature Sensor", 5, 7, 5));
        Thread lightController = new Thread(new DeviceTask("Light Controller", 4, 5, 5));
        Thread doorLockMonitor = new Thread(new DeviceTask("Door Lock Monitor", 6, 5, 5));
        securityCamera.start();
        temperatureSensor.start();
        lightController.start();
        doorLockMonitor.start();
        try {
            securityCamera.join();
            temperatureSensor.join();
            lightController.join();
            doorLockMonitor.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("All devices have completed. Smart Home System shutting down.");
    }
}
