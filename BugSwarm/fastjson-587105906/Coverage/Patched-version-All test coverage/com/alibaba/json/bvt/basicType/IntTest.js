var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":51025,"methods":[{"el":20,"sc":5,"sl":12},{"el":34,"sc":5,"sl":22}],"name":"IntTest","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1992":{"methods":[{"sl":12}],"name":"test_array","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15},{"sl":16},{"sl":17},{"sl":18}]},"test_4828":{"methods":[{"sl":22}],"name":"test_map","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26},{"sl":29},{"sl":30},{"sl":31},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1992], [1992], [1992], [1992], [1992], [1992], [1992], [], [], [], [4828], [4828], [4828], [4828], [4828], [], [], [4828], [4828], [4828], [4828], [], [], []]
