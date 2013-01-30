{:namespaces
 ({:source-url
   "https://github.com/clojure/tools.trace/blob/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace/clojure.tools.trace-api.html",
   :name "clojure.tools.trace",
   :author
   "Stuart Sierra, Michel Salim, Luc Préfontaine, Jonathan Fischer Friberg, Michał Marczyk, Don Jackson",
   :doc
   "This file defines simple tracing macros to help you see what your code is doing."}),
 :vars
 ({:arglists ([name & definition]),
   :name "deftrace",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj#L97",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/deftrace",
   :doc
   "Use in place of defn; traces each call/return of this fn, including\narguments. Nested calls to deftrace'd functions will print a\ntree-like structure.\nThe first argument of the form definition can be a doc string",
   :var-type "macro",
   :line 97,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([fnames & exprs]),
   :name "dotrace",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj#L111",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/dotrace",
   :doc
   "Given a sequence of function identifiers, evaluate the body\nexpressions in an environment in which the identifiers are bound to\nthe traced functions. Does not work on inlined functions,\nsuch as clojure.core/+",
   :var-type "macro",
   :line 111,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([value] [name value]),
   :name "trace",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj#L72",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace",
   :doc
   "Sends name (optional) and value to the tracer function, then\nreturns value. May be wrapped around any expression without\naffecting the result.",
   :var-type "function",
   :line 72,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([& body]),
   :name "trace-forms",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj#L229",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-forms",
   :doc
   "Trace all the forms in the given body. Returns any underlying uncaught exceptions that may make the forms fail.",
   :var-type "macro",
   :line 229,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns]),
   :name "trace-ns",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj#L305",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-ns",
   :doc "Trace all fns in the given name space.",
   :var-type "macro",
   :line 305,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([& vs]),
   :name "trace-vars",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj#L277",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/trace-vars",
   :doc
   "Trace each of the specified Vars.\nThe arguments may be Var objects or symbols to be resolved in the current\nnamespace.",
   :var-type "macro",
   :line 277,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([v]),
   :name "traceable?",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj#L330",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/traceable?",
   :doc "Returns true if the given var can be traced, false otherwise",
   :var-type "function",
   :line 330,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([v]),
   :name "traced?",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj#L324",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/traced?",
   :doc
   "Returns true if the given var is currently traced, false otherwise",
   :var-type "function",
   :line 324,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([ns]),
   :name "untrace-ns",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj#L319",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/untrace-ns",
   :doc "Untrace all fns in the given name space.",
   :var-type "macro",
   :line 319,
   :file "src/main/clojure/clojure/tools/trace.clj"}
  {:arglists ([& vs]),
   :name "untrace-vars",
   :namespace "clojure.tools.trace",
   :source-url
   "https://github.com/clojure/tools.trace/blob/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj#L284",
   :raw-source-url
   "https://github.com/clojure/tools.trace/raw/da0524a9f15202123a8bf2a9f1f40358b3bcd847/src/main/clojure/clojure/tools/trace.clj",
   :wiki-url
   "http://clojure.github.com/tools.trace//clojure.tools.trace-api.html#clojure.tools.trace/untrace-vars",
   :doc
   "Untrace each of the specified Vars.\nReverses the effect of trace-var / trace-vars / trace-ns for each\nof the arguments, replacing the traced functions with the original,\nuntraced versions.",
   :var-type "macro",
   :line 284,
   :file "src/main/clojure/clojure/tools/trace.clj"})}