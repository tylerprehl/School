(* This is an OCaml editor.
Enter your program here and send it to the toplevel using the "Eval code"
button or [Ctrl-e]. *)

(*0*)
let addfirsttwo l = List.hd l + List.hd (List.tl l);;

(*1*)
let isnil l = match l with [] -> true | _ -> false;; 

(*2*)  
let rec len l = if isnil l then 0 else 1 + len (List.tl l);;

(*3*)
let addfirsttwolength l = len (List.hd l) + len (List.hd (List.tl l));;

(*4*)
let rec sum l = if isnil l then 0 else List.hd l + sum (List.tl l);;

(*5*)
let rec sum2 l = if l==[] then 0 else List.hd l + sum (List.tl l);;

(*6*)
let rec range n m = if n=m then [n] else n::(range (n+1) m);;

(*7*)
let rec allpositive l = if isnil l then true else 
  if (List.hd l) <= 0 then false else allpositive (List.tl l);;

(*8*)
let rec concat l = if l=[] then [] else (List.hd l) @ concat(List.tl l);;

(*9*)
let rec reverse l = if isnil l then [] else (reverse (List.tl l)) @ [List.hd l];;

(*10*)
let rec remove a l = if isnil l then l else 
  if (List.hd l)=a then List.tl l else (List.hd l)::remove a (List.tl l);;

(*11*)
let rec nth l n = if isnil l then -1 else
  if n=0 then List.hd l else nth (List.tl l) (n-1);;

(*12*)
let rec insert a l = if isnil l then raise() else 
  if (List.hd l)<a then (List.hd l)::insert a (List.tl l) else 
  if (List.hd l)>=a then a::l else [];;






