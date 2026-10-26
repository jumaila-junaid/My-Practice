function HouseKeeper (yearsOfExperience, name, cleaningRepertoire) {
    this.yearsOfExperience = yearsOfExperience;
    this.name = name;
    this.cleaningRepertoire = cleaningRepertoire;
    this.clean = function () {
        alert("Cleaning in prograss...");
    }
}

var houseKeeper1 = new HouseKeeper(9, "Tom", ["lobby", "bedroom"]);

var houseKeeper2 = new HouseKeeper(14, "Janet", ["lobby", "bedroom"]);

var houseKeeper3 = new HouseKeeper(12, "James", ["bedroom"]);