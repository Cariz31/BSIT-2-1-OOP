1. Why is the list in RideManager typed ArrayList<Ride> and not ArrayList<Jeepney>?
 
- Because ArrayList<Ride> put all the files such as Tricycle, Jeepney and Taxi, they are all vehicles that extend to them so this RideManager manage all rides because its the parent that allows polymorphism goes for correct methods.


2. In showStudentDiscounts(), why must you check instanceof before the cast?
 
- Because instanceof that checks whether the object can be treated as a StudentDiscount before doing the cast. Without the check, a ride such as Taxi could cause an error because Taxi does not implement StudentDiscount.