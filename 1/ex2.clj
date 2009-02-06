; (. System getProperty "line.separator")  -> "\r\n"

(. javax.swing.JOptionPane (showMessageDialog nil "Hello World\r\nHi Mom"))


;;; How would I write this code so that it is arch-independent - 
;;; where you concatenate "Hello World" (. System getProperty "line.separator") "Hi Mom"

;;; http://java.sun.com/j2se/1.4.2/docs/api/java/lang/String.html#concat(java.lang.String)
;;; (.concat (.concat "a" "b") "c")
; [00:57] ayrnieu: ,(-> "a" (.concat "b") (.concat "c"))
; [00:58] durka42: ,(.. "a" (concat "b") (concat "c") (concat "d"))

