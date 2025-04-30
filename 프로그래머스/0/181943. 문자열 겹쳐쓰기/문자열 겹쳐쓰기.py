def solution(my_string, overwrite_string, s):
    # my_string을 overwrite_string 길이까지 자름
    # overwrite_string 문자열 더하기
    # s+overwrite_string 길이만큼 출력
    answer = my_string[:s] + overwrite_string + my_string[s+len(overwrite_string):]
    return answer