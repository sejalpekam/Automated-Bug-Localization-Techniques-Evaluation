var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":73132,"methods":[{"el":18,"sc":5,"sl":13},{"el":29,"sc":5,"sl":20}],"name":"Bug0","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_295":{"methods":[{"sl":13}],"name":"test_0","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17}]},"test_3402":{"methods":[{"sl":20}],"name":"test_array_exception","pass":false,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [295], [295], [295], [295], [295], [], [], [3402], [3402], [3402], [3402], [3402], [], [], [], [3402], [], []]
