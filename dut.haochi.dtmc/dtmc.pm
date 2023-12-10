dtmc

	const double p1;
	const double p2;
	
module acme
	s : [0..8] init 0;
	
	[]	s=0 -> (p1):(s'=1)+(1-p1):(s'=2);	
	[]	s=1 -> 1:(s'=8);	
	
	[]	s=2 -> 1:(s'=3);	
	
	[]	s=3 -> 1:(s'=4);	
	
	
	[]	s=4 -> (p2):(s'=5)+(1-p2):(s'=7);	
	[]	s=5 -> 1:(s'=6);	
	
	[]	s=6 -> 1:(s'=4);	
	
	[]	s=7 -> 1:(s'=8);	
	
	[]	s=8 -> 1:(s'=8);	
	
endmodule

rewards"time"
	s=5 : 3.2;	
endrewards

rewards"cost"
	s=1 : 7.0;	
endrewards

