.386
.model flat, stdcall
.stack 4096
ExitProcess PROTO, dwExitCode: DWORD

.data
qVal qword 0506030740800102h
.code
main PROC
xor eax,eax
xor ebx,ebx
xor ecx,ecx
xor edx,edx
lea esi,qVal   
mov ax,WORD PTR[esi+6]   
mov bx,WORD PTR[esi+4]   
mov cx,WORD PTR[esi+2]   
mov dx,WORD PTR[esi]   
add ax,bx
add ax,cx
add ax,dx

INVOKE ExitProcess, 0
main ENDP
end main