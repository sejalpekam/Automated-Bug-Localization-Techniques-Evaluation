var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":38,"id":86602,"methods":[{"el":18,"sc":5,"sl":15},{"el":26,"sc":5,"sl":20},{"el":37,"sc":5,"sl":28}],"name":"EnumTest2","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1870":{"methods":[{"sl":28}],"name":"test_enum_noasm","pass":true,"statements":[{"sl":29},{"sl":30},{"sl":32},{"sl":33},{"sl":34},{"sl":35},{"sl":36}]},"test_2458":{"methods":[{"sl":20}],"name":"test_enum","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23},{"sl":24},{"sl":25}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2458], [2458], [2458], [2458], [2458], [2458], [], [], [1870], [1870], [1870], [], [1870], [1870], [1870], [1870], [1870], [], []]
