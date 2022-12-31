def solution(money: int) -> list:
    return [money // 5500, money % 5500]

if __name__ == '__main__':
    print(solution(5500))    
    print(solution(15000))   