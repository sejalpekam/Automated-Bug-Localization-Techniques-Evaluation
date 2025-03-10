var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":69,"id":66962,"methods":[{"el":50,"sc":5,"sl":37},{"el":68,"sc":5,"sl":52}],"name":"MixInRemovalTest","sl":8},{"el":21,"id":66962,"methods":[{"el":15,"sc":9,"sl":13},{"el":20,"sc":9,"sl":17}],"name":"MixInRemovalTest.BaseClass","sl":9},{"el":28,"id":66966,"methods":[],"name":"MixInRemovalTest.MixIn1","sl":23},{"el":35,"id":66966,"methods":[],"name":"MixInRemovalTest.MixIn2","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1082":{"methods":[{"sl":13},{"sl":52}],"name":"test_mixInRemoval_deserialize","pass":true,"statements":[{"sl":53},{"sl":54},{"sl":55},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":63},{"sl":64},{"sl":65},{"sl":66},{"sl":67}]},"test_1701":{"methods":[{"sl":17},{"sl":37}],"name":"test_mixInRemoval_serialize","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":38},{"sl":39},{"sl":41},{"sl":42},{"sl":43},{"sl":45},{"sl":46},{"sl":47},{"sl":49}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [1082], [], [], [], [1701], [1701], [1701], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1701], [1701], [1701], [], [1701], [1701], [1701], [], [1701], [1701], [1701], [], [1701], [], [], [1082], [1082], [1082], [1082], [], [1082], [1082], [1082], [1082], [1082], [], [1082], [1082], [1082], [1082], [1082], [], []]
