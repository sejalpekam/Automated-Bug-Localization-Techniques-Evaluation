var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":46,"id":44726,"methods":[{"el":34,"sc":5,"sl":27},{"el":39,"sc":5,"sl":36},{"el":44,"sc":5,"sl":41}],"name":"JsonValueTest","sl":25}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_133":{"methods":[{"sl":27}],"name":"test_toJSONString","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":31},{"sl":32},{"sl":33}]},"test_1458":{"methods":[{"sl":36}],"name":"test_bug_0","pass":true,"statements":[{"sl":37},{"sl":38}]},"test_3010":{"methods":[{"sl":41}],"name":"test_bug_1","pass":true,"statements":[{"sl":42},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [133], [133], [133], [133], [133], [133], [133], [], [], [1458], [1458], [1458], [], [], [3010], [3010], [3010], [], [], []]
