num = int(input('Введите число: '))
step = int(input('Введите степень: '))

def stepen():
    res1 = num**step
    return res1

def rekurs(num, step):
    if step >= 0:
        if step == 0:
            res2 = 1
            return res2
        res2 = num * rekurs(num, step - 1)  # Вызов рекурсии
        return res2
    else:
        res2 = 'Ошибка ввода'
        return res2

print(f'Число, полученное с помощью возведения в степень: {stepen()}\n'
      f'Число, полученное с помощью рекурсии: {rekurs(num, step)}')