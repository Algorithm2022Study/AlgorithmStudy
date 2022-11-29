# 문제 설명
# 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 
# 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

# 제한 조건
# x는 1 이상, 10000 이하인 정수입니다.



def solution(x):
    answer = True
    hab=0
    if(x<10):
        hab=x
        answer = True
    elif(x>=10 and x<100):
        ja1= x%10
        ja10= int(x/10)
        hab=ja1+ja10
        if (x%hab==0):
            answer = True
        else:
            answer = False
    elif(x>=100 and x<1000):
        
        ja100=int(x/100)
        ja10=int((x-ja100*100)/10)
        ja1=x-ja100*100-ja10*10
        hab=ja100+ja10+ja1
        if (x%hab==0):
            answer = True
        else:
            answer = False    
    elif(x>=1000 and x<10000):
        ja1000=int(x/1000)
        ja100=int((x-ja1000*1000)/100)
        ja10=int((x-ja1000*1000-ja100*100)/10)
        ja1=x-ja1000*1000-ja100*100-ja10*10
        hab=ja1000+ja100+ja10+ja1
        if (x%hab==0):
            answer = True
        else:
            answer = False
    return answer