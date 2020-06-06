class freezboil{
    double temperature;
    public void temp(double t){
        temperature = t;
    }
    public boolean ethylF(){
        if (temperature <= -173)
        return true;
        else
        return false;
    }
    public boolean ethylB(){
        if (temperature >= 172)
        return true;
        else
        return false;
    }
    public boolean oxygenF(){
        if (temperature <= -362)
        return true;
        else
        return false;
    }
    public boolean oxygenB(){
        if (temperature >= -306)
        return true;
        else
        return false;
    }
    public boolean waterF(){
        if (temperature <= 32)
        return true;
        else
        return false;
    }
    public boolean waterB(){
        if (temperature >= 212)
        return true;
        else
        return false;
    }
}