(* CSC 345-01 Assignment #4
   On my honor, Tyler Prehl, this assignment is my own work.  
   I, Tyler Prehl, will follow the instructor's rules and processes 
   related to academic integrity as directed in the course syllabus.

   *** You are NOT allowed to use OCaml's pattern matching for this assignment. ***

   *** DO NOT CHANGE ANYTHING IN THIS FILE EXCEPT THE PLACEHOLDERS. ***
*) 



(* 1. Write a function averageThree to return the average of three integers. 
      For example, averageThree (-1) 1 2;; returns 0.66666666666666663 *)
let averageThree : int -> int -> int -> float = fun x y z -> (float_of_int x +. float_of_int y +. float_of_int z) /. 3.0 ;;



(* 2. Write a function howManyAboveAverage that returns how many of three integer inputs are above its average value.  
      For example, howManyAboveAverage 1 3 3;; returns 2 *)
let howManyAboveAverage : int -> int -> int -> int = fun x y z -> let avg = averageThree x y z and x = float_of_int x and 
  y = float_of_int y and z = float_of_int z in 
  if (x>avg && y>avg) || (x>avg && z>avg) || (y>avg && z>avg) then 2 else 
  if (x>avg) || (y>avg) || (z>avg) then 1 else 0;;



(* 3. Write a function howManyWithinThreshold that returns how many of the first three arguments are within the threshold 
   (the fourth argument) of the average of the first three arguments. 
       For example, howManyWithinThreshold 10 1 2 3.5;; returns 2 *)
let howManyWithinThreshold : int -> int -> int -> float -> int = fun x y z t -> let avg = averageThree x y z and x = float_of_int x and
  y = float_of_int y and z = float_of_int z in 
  let xbool = (x>(avg-.t) && x<(avg+.t)) and 
    ybool = (y>(avg-.t) && y<(avg+.t)) and
    zbool = (z>(avg-.t) && z<(avg+.t)) in 
  if xbool && ybool && zbool then 3 else
  if (xbool && ybool) || (xbool && zbool) || (ybool && zbool) then 2 else
  if xbool || ybool || zbool then 1 else 0;; 



(* 4. Write a function threeDifferent that returns true if no two of the three arguments are equal, and false otherwise.  
      For example, threeDifferent 1 2 2;; returns false *)	  
let threeDifferent : int -> int -> int -> bool = fun x y z -> if (x==y) || (y==z) || (x==z) then false else true;;



(* 5. Write a function sum that uses recursion to compute the sum of all numbers from 1 to n, where n is greater than or equal to 1.
      For example, sum 3;; returns 6 *)
let rec sum : int -> int = fun n -> if n = 0 then 0 else n + (sum (n-1));;



(* 6. Write a function getBinary that uses recursion to convert an integer n (where n is greater than or equal to 0) 
   to its binary representation.
      For example, getBinary 12;; returns 1100 
                   getBinary 7;;  returns 111
                   getBinary 42;; returns 101010 
      Hint:    if n's binary representation is 10010101011
            (n / 2)'s binary representation is 1001010101
            (N % 2)'s binary representation is           1 *)	  
let rec getBinary : int -> int = fun n -> if n == 1 || n == 0 then n else 
    int_of_string ( string_of_int (getBinary (n/2)) ^ string_of_int (n mod 2) );;



(* 7. Write a function howManyDigits that uses recursion to count the digits of an integer n (where n is greater than or equal to 1).
      For example, howManyDigits 978;; returns 3 *)
let rec howManyDigits : int -> int = fun n ->  if n/10 == 0 then 1 else
    1 + (howManyDigits (n / 10));;



(* 8. Write a function orderTriple that takes a triple, and returns a version in increasing order.
      For example, orderTriple (2, 1, 3);; returns (1, 2, 3) *)
let orderTriple : int * int * int -> int * int * int = fun (x, y, z) -> 
  if x<y && x<z then if y<z then (x, y, z) else (x, z, y) else 
  if x>y && x>z then if y<z then (y, z, x) else (z, y, x) else
  if x>y && x<z then (y, x, z) else (z, x, y);;











