var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":80991,"methods":[{"el":12,"sc":5,"sl":9},{"el":17,"sc":5,"sl":14}],"name":"JSONPath_like","sl":8}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1603":{"methods":[{"sl":14}],"name":"test_like_not_match_1","pass":true,"statements":[{"sl":15}]},"test_4134":{"methods":[{"sl":9}],"name":"test_like_not_match","pass":true,"statements":[{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [4134], [4134], [], [], [], [1603], [1603], [], [], [], []]
