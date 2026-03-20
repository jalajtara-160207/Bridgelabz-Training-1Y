package com.inheritance;

public class Devices {
    int DeviceID;
    String Status;

    public Devices(int DeviceID, String Status) {
        this.DeviceID = DeviceID;
        this.Status = Status;
    }

    public void DisplayDetails()
    {
        System.out.println("Enter The ID of the Device:-"+DeviceID);
        System.out.println("Enter The Status of the Device:-"+Status);
    }
}
class Thermostat extends Devices
{
    int TemperatureSetting;

    public Thermostat(int DeviceID, String Status, int TemperatureSetting)
    {
        super(DeviceID, Status);
        this.TemperatureSetting = TemperatureSetting;
    }

    public double getTemperatureSetting() {
        return TemperatureSetting;
    }


    @Override
    public void DisplayDetails()
    {
        super.DisplayDetails();
        System.out.println("The Temperature Setting Of The Device is:-"+TemperatureSetting);
    }
}

