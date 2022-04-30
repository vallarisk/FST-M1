class Cars:
    
    def __init__(self,manufacturer,model, make, transmission, color ):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer +" "+ self.model +" "+ "is moving")

    def stop(self):
        print(self.manufacturer +" "+ self.model +" "+ "has stopped")
    
Car1=Cars("TATA","Nexon","2022","auto","blue")
Car2=Cars("Maruti","Celerio","2019","auto","red")
Car3=Cars("Honda","City","2010","manual","black")

Car1.accelerate()
Car1.stop()

Car2.accelerate()
Car2.stop()

Car3.accelerate()
Car3.stop()