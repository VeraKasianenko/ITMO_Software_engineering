t1 = float(input('Введите первое время в часах: '))
v1 = float(input('Введите первую скорость: '))
t2 = float(input('Введите второе время в часах: '))
v2 = float(input('Введите вторую скорость: '))

def length():
    s = t1 * v1 + t2 * v2  # S = v * t
    s = ('%.2f' % s)
    return s

print('Расстояние в км, которое проехал автомобиль:', length())