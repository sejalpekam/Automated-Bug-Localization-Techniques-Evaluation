var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":63283,"methods":[{"el":19,"sc":5,"sl":13},{"el":27,"sc":5,"sl":21},{"el":35,"sc":5,"sl":29}],"name":"Issue1628","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2081":{"methods":[{"sl":13}],"name":"test_toJSONBytes","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18}]},"test_360":{"methods":[{"sl":21}],"name":"test_toJSONBytes_1","pass":true,"statements":[{"sl":22},{"sl":23},{"sl":24},{"sl":25},{"sl":26}]},"test_3664":{"methods":[{"sl":29}],"name":"test_toJSONBytes_2","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":33},{"sl":34}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2081], [2081], [2081], [2081], [2081], [2081], [], [], [360], [360], [360], [360], [360], [360], [], [], [3664], [3664], [3664], [3664], [3664], [3664], [], []]
