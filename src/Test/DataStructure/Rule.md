### 합배열 S 만드는 공식
S[i] = S[i-1] + A[i]

### 구간합을 구하는 공식
S[j] - S[i-1]

### Ex A[2] ~ A[5]
S[5] = A[0] + A[1] + A[2] + A[3] + A[4] + A[5]
S[1] = A[0] + A[1]
S[5] - S[1] = A[2] + A[3] + A[4] + A[5]