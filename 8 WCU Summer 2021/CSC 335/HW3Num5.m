clear
t = 1:pi/100:2*pi
y = -0.3 + 0.1*cos(20*pi*t) + 0.5*cos(40*pi*t + pi/5) + 0.7*cos(60*pi*t + pi/8) + 0.2*cos(80*pi*t + pi/3);
plot(y);